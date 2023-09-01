package app.dinus.com.example;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import app.dinus.com.loadingdrawable.render.LoadingDrawable;
import app.dinus.com.loadingdrawable.render.LoadingRenderer;
import app.dinus.com.loadingdrawable.render.circle.rotate.MaterialLoadingRenderer;
import app.dinus.com.loadingdrawable.render.circle.rotate.WhorlLoadingRenderer;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mBtnGoods;
    private Button mBtnAnimal;
    private Button mBtnScenery;
    private Button mBtnCircleJump;
    private Button mBtnShapeChange;
    private Button mBtnCircleRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnGoods = (Button) findViewById(R.id.goods);
        mBtnAnimal = (Button) findViewById(R.id.animal);
        mBtnScenery = (Button) findViewById(R.id.scenery);
        mBtnCircleJump = (Button) findViewById(R.id.circle_jump);
        mBtnShapeChange = (Button) findViewById(R.id.shape_change);
        mBtnCircleRotate = (Button) findViewById(R.id.circle_rotate);

        mBtnGoods.setOnClickListener(this);
        mBtnAnimal.setOnClickListener(this);
        mBtnScenery.setOnClickListener(this);
        mBtnCircleJump.setOnClickListener(this);
        mBtnShapeChange.setOnClickListener(this);
        mBtnCircleRotate.setOnClickListener(this);

        ImageView iv_test = findViewById(R.id.iv_test);
        MaterialLoadingRenderer.Builder builder = new MaterialLoadingRenderer.Builder(this);
        builder.setWidth(250);
        builder.setHeight(250);
        LoadingDrawable drawable = new LoadingDrawable(builder.build());
        iv_test.setImageDrawable(drawable);
        drawable.start();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.shape_change:
                ShapeChangeActivity.startActivity(this);
                break;
            case R.id.goods:
                GoodsActivity.startActivity(this);
                break;
            case R.id.animal:
                AnimalActivity.startActivity(this);
                break;
            case R.id.scenery:
                SceneryActivity.startActivity(this);
                break;
            case R.id.circle_jump:
                CircleJumpActivity.startActivity(this);
                break;
            case R.id.circle_rotate:
                CircleRotateActivity.startActivity(this);
                break;
            default:
                break;
        }
    }
}
