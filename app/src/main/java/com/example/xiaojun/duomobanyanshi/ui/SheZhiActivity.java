package com.example.xiaojun.duomobanyanshi.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xiaojun.duomobanyanshi.MyApplication;
import com.example.xiaojun.duomobanyanshi.R;
import com.example.xiaojun.duomobanyanshi.adapter.SpaceItemDecoration;
import com.example.xiaojun.duomobanyanshi.beans.BaoCunBean;
import com.example.xiaojun.duomobanyanshi.beans.BaoCunBeanDao;
import com.example.xiaojun.duomobanyanshi.beans.SheZhiBean;
import com.sdsmdg.tastytoast.TastyToast;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;



public class SheZhiActivity extends BaseActivity implements View.OnClickListener {
    private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    private List<Button> sheZhiBeanList;
    private RecyclerView mTvRecyclerView;
    private BaoCunBeanDao baoCunBeanDao=null;
    private BaoCunBean baoCunBean=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        baoCunBeanDao= MyApplication.myApplication.getDaoSession().getBaoCunBeanDao();
        baoCunBean=baoCunBeanDao.load(123456L);

        requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏

        setContentView(R.layout.activity_she_zhi);
        if (baoCunBean==null ){
           BaoCunBean baoCunBean=new BaoCunBean();
            baoCunBean.setId(123456L);
            baoCunBeanDao.insert(baoCunBean);
            Log.d("SheZhiActivity", "插入");
        }

        if (baoCunBean!=null && baoCunBean.getIsHengOrShu()){
            /**
             * 设置为横屏
             */
            if(this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            }

        }else {
            /**
             * 设置为竖屏
             */
            if(this.getResources().getConfiguration().orientation != Configuration.ORIENTATION_PORTRAIT){
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }

        }




        bt1= (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(this);
        bt2= (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(this);
        bt3= (Button) findViewById(R.id.bt3);
        bt3.setOnClickListener(this);
        bt4= (Button) findViewById(R.id.bt4);
        bt4.setOnClickListener(this);
        bt5= (Button) findViewById(R.id.bt5);
        bt5.setOnClickListener(this);
        bt6= (Button) findViewById(R.id.bt6);
        bt6.setOnClickListener(this);
        bt1.requestFocus();
        sheZhiBeanList = new ArrayList<>();
        sheZhiBeanList.add(bt1);
        sheZhiBeanList.add(bt2);
        sheZhiBeanList.add(bt3);
        sheZhiBeanList.add(bt4);
        sheZhiBeanList.add(bt5);
        sheZhiBeanList.add(bt6);

        if (baoCunBean!=null && baoCunBean.getIsHengOrShu()){
            bt6.setText("已设置为横屏");
        }else {
            bt6.setText("已设置为竖屏");
        }

}

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        Log.d("SheZhiActivity", "opopopop");

        return super.onKeyDown(keyCode, event);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt1:
                ChongsZHI();
                bt1.requestFocus();
                bt1.setTextColor(Color.WHITE);
                bt1.setBackgroundResource(R.drawable.zidonghuoqu1);
                  AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(
                        //	ObjectAnimator.ofFloat(manager.getChildAt(1),"translationY",-1000,0),
                            ObjectAnimator.ofFloat(bt1,"scaleX",1.0f,1.2f,1.0f),
                            ObjectAnimator.ofFloat(bt1,"scaleY",1.0f,1.2f,1.0f)
                    );
                    //animatorSet.setInterpolator(new DescelerateInterpolator());
                    animatorSet.setDuration(300);
                    animatorSet.addListener(new AnimatorListenerAdapter(){
                        @Override public void onAnimationEnd(Animator animation) {


                        }
                    });
                    animatorSet.start();
                break;
            case R.id.bt2:
                ChongsZHI();
                bt2.requestFocus();
                bt2.setTextColor(Color.WHITE);
                bt2.setBackgroundResource(R.drawable.zidonghuoqu1);

                break;
            case R.id.bt3:
                ChongsZHI();
                bt3.requestFocus();
                bt3.setTextColor(Color.WHITE);
                bt3.setBackgroundResource(R.drawable.zidonghuoqu1);
                break;
            case R.id.bt4:
                ChongsZHI();
                bt4.requestFocus();
                bt4.setTextColor(Color.WHITE);
                bt4.setBackgroundResource(R.drawable.zidonghuoqu1);
                break;
            case R.id.bt5:
                ChongsZHI();
                bt5.requestFocus();
                bt5.setTextColor(Color.WHITE);
                bt5.setBackgroundResource(R.drawable.zidonghuoqu1);
                break;
            case R.id.bt6:
                ChongsZHI();
                bt6.requestFocus();
                bt6.setTextColor(Color.WHITE);
                bt6.setBackgroundResource(R.drawable.zidonghuoqu1);
                AnimatorSet animatorSet6 = new AnimatorSet();
                animatorSet6.playTogether(
                        //	ObjectAnimator.ofFloat(manager.getChildAt(1),"translationY",-1000,0),
                        ObjectAnimator.ofFloat(bt6,"scaleX",1.0f,1.2f,1.0f),
                        ObjectAnimator.ofFloat(bt6,"scaleY",1.0f,1.2f,1.0f)
                );
                //animatorSet.setInterpolator(new DescelerateInterpolator());
                animatorSet6.setDuration(300);
                animatorSet6.addListener(new AnimatorListenerAdapter(){
                    @Override public void onAnimationEnd(Animator animation) {
                        if (baoCunBean.getIsHengOrShu()){ //false为 竖屏
                            baoCunBean.setIsHengOrShu(false);
                            baoCunBeanDao.update(baoCunBean);
                            baoCunBean=baoCunBeanDao.load(123456L);
                            bt6.setText("已设置为竖屏");
                            TastyToast.makeText(SheZhiActivity.this,"已设置为竖屏",TastyToast.LENGTH_SHORT,TastyToast.INFO).show();

                        }else {
                            baoCunBean.setIsHengOrShu(true);
                            baoCunBeanDao.update(baoCunBean);
                            baoCunBean=baoCunBeanDao.load(123456L);
                            bt6.setText("已设置为横屏");
                            TastyToast.makeText(SheZhiActivity.this,"已设置为横屏",TastyToast.LENGTH_SHORT,TastyToast.INFO).show();
                        }


                    }
                });
                animatorSet6.start();

                break;
        }

    }

    private void  ChongsZHI(){
        for (int i=0;i<sheZhiBeanList.size();i++){
            sheZhiBeanList.get(i).setBackgroundResource(R.drawable.zidonghuoqu2);
            sheZhiBeanList.get(i).setTextColor(Color.parseColor("#1b37d6"));

        }

    }
}
