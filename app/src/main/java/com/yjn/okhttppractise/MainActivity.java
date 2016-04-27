package com.yjn.okhttppractise;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.yjn.okhttppractise.bean.FuliBean;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.BitmapCallback;
import com.zhy.http.okhttp.callback.StringCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Request;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.textView1)
    Button textView1;
    @Bind(R.id.textView2)
    Button textView2;
    @Bind(R.id.imageView1)
    ImageView imageView1;
    @Bind(R.id.progress)
    ProgressBar mProgressBar;
    @Bind(R.id.textView3)
    TextView err;

    private String url;
    String[] keyWords = {"Android", "福利", "iOS", "休息视频", "拓展资源", "前端", "all"};

    List<FuliBean> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public class MyStringCallback extends StringCallback {
        @Override
        public void onBefore(Request request) {
            super.onBefore(request);
            setTitle("loading...");
        }

        @Override
        public void onAfter() {
            super.onAfter();
            setTitle("Sample-okHttp");
        }

        @Override
        public void onError(Call call, Exception e) {
            e.printStackTrace();
            err.setText("onError:" + e.getMessage());
        }

        @Override
        public void onResponse(String response) {
            Log.d("response---", response);
            err.setText("onResponse:" + response);
            try {

                JSONObject jsonObject = new JSONObject(response);
                JSONArray jsonOb = (JSONArray) jsonObject.get("results");

                FuliBean fuli = new Gson().fromJson(jsonObject.getString("results"), FuliBean.class);

                if (!fuli.getUrl().isEmpty()) {
                    Log.d("Type---", fuli.getType());
                }

            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        @Override
        public void inProgress(float progress) {
            Log.e("MainActivity", "inProgress:" + progress);
            mProgressBar.setProgress((int) (100 * progress));
        }
    }

    @OnClick({R.id.textView1, R.id.textView2})
    void click(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.textView1:
                // example:  http://gank.io/api/data/Android/10/1
                int key = (int) Math.round(Math.random() * 5);
                int number = (int) Math.round(Math.random() * 100);
                int page = (int) Math.round(Math.random() * 60);
//        url = Apis.GanHuo + "/" + keyWords[key] + "/" +number+"/"+ page;
                url = "http://gank.io/api/data/Android/10/1";
//        url = "https://api.github.com/users/yangxiaoge";
                Log.d("GANHUO-----", url);
                OkHttpUtils.get().url(url).build().execute(new MyStringCallback());
                break;
            case R.id.textView2:
                url = "http://ww3.sinaimg.cn/large/7a8aed7bjw1f39v1uljz8j20c50hst9q.jpg";

                OkHttpUtils
                        .get()//
                        .url(url)//
                        .tag(this)//
                        .build()//
                        .connTimeOut(20000)
                        .readTimeOut(20000)
                        .writeTimeOut(20000)
                        .execute(new BitmapCallback() {
                            @Override
                            public void onError(Call call, Exception e) {
                                err.setText("onError:" + e.getMessage());
                            }

                            @Override
                            public void onResponse(Bitmap bitmap) {
                                imageView1.setImageBitmap(bitmap);
                            }
                        });
                break;
        }
    }

}
