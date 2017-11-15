package cn.xm.weidongjian.glidedemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private ImageView imageView;
    private RequestManager glideRequest;
    private Context context = this;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        glideRequest = Glide.with(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                glideRequest.load("http://androidop.le890.com/hma/upload/2016/10/11/1704146358.png").into(imageView);
                glideRequest.load("http://androidop.le890.com/hma/upload/2016/10/11/1716089900.png").into(imageView2);
                break;
            case R.id.button2:
                glideRequest.load("http://androidop.le890.com/hma/upload/2016/10/11/1704146358.png").transform(new GlideRoundTransform(context)).into(imageView);
                glideRequest.load("http://androidop.le890.com/hma/upload/2016/10/11/1716089900.png").transform(new GlideRoundTransform(context)).into(imageView2);
                break;
            case R.id.button3:
                glideRequest.load("http://androidop.le890.com/hma/upload/2016/10/11/1704146358.png").transform(new GlideRoundTransform(context, 7)).into(imageView);
                glideRequest.load("http://androidop.le890.com/hma/upload/2016/10/11/1716089900.png").transform(new GlideRoundTransform(context, 7)).into(imageView2);
                break;
            case R.id.button4:
                glideRequest.load("http://androidop.le890.com/hma/upload/2016/10/11/1704146358.png").transform(new GlideCircleTransform(context)).into(imageView);
                glideRequest.load("http://androidop.le890.com/hma/upload/2016/10/11/1716089900.png").transform(new GlideCircleTransform(context)).into(imageView2);
                break;
        }
    }
}
