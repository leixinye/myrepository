package com.example.actionbardemo;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.AvoidXfermode;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		  // 得到Activity的ActionBar
        ActionBar actionBar = getActionBar();
        // 设置AcitonBar的操作模型
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        // 将Activity的头部去掉
        actionBar.setDisplayShowTitleEnabled(false);
        // 生成Tab
        Tab lvxing = actionBar.newTab().setText("旅行");
        Tab gaoxiao = actionBar.newTab().setText("搞笑");
        Tab shoucang = actionBar.newTab().setText("收藏");
        Tab qiche = actionBar.newTab().setText("汽车");
        Tab shishang = actionBar.newTab().setText("时尚");
        Tab qinggan = actionBar.newTab().setText("情感");
        Tab youxi = actionBar.newTab().setText("游戏");
        Tab shipin=actionBar.newTab().setText("视频");
        
        
        
        Tab jianshen = actionBar.newTab().setText("健身");
        Tab yangsheng = actionBar.newTab().setText("养生");
        Tab junshi = actionBar.newTab().setText("军事");
        Tab qinzi= actionBar.newTab().setText("亲子");
        Tab yuedu=actionBar.newTab().setText("阅读");
        Tab shouji=actionBar.newTab().setText("手机");
      
        // 为每个Tab添加Listener
        MyTabListener editListener = new MyTabListener(new Fragment_A());
        lvxing.setTabListener(editListener);
        MyTabListener computerListener = new MyTabListener(new Fragment_B());
        gaoxiao.setTabListener(computerListener);
        MyTabListener shouListener = new MyTabListener(new Fragment_C());
        shoucang.setTabListener(shouListener);
        MyTabListener qicheListener = new MyTabListener(new Fragment_D());
        qiche.setTabListener(qicheListener);
        MyTabListener shiListener = new MyTabListener(new Fragment_E());
        shishang.setTabListener(shiListener);
        MyTabListener qingganListener = new MyTabListener(new Fragment_F());
        qinggan.setTabListener(qingganListener);
        MyTabListener youxiListener = new MyTabListener(new Fragment_G());
        youxi.setTabListener(youxiListener);
        MyTabListener shipinListener=new MyTabListener(new Fragment_H());
        shipin.setTabListener(shipinListener);
        
        MyTabListener jianshenListener = new MyTabListener(new Fragment_I());
        jianshen.setTabListener(jianshenListener);
        MyTabListener yangshengListener = new MyTabListener(new Fragment_J());
        yangsheng.setTabListener(yangshengListener);
        MyTabListener junshiListener = new MyTabListener(new Fragment_K());
        junshi.setTabListener(junshiListener);
        MyTabListener qinziListener = new MyTabListener(new Fragment_L());
        qinzi.setTabListener(qinziListener);
        MyTabListener yueduListener = new MyTabListener(new Fragment_M());
        yuedu.setTabListener(yueduListener);
        MyTabListener shoujiListener=new MyTabListener(new Fragment_N());
        shouji.setTabListener(shoujiListener);
        
        
        
        
        
        
        // 将Tab加入ActionBar中
        actionBar.addTab(lvxing);
        actionBar.addTab(gaoxiao);
        actionBar.addTab(shoucang);
        actionBar.addTab(qiche);
        actionBar.addTab(shishang);
        actionBar.addTab(qinggan);
        actionBar.addTab(youxi);
        actionBar.addTab(shipin);
        
        actionBar.addTab(jianshen);
        actionBar.addTab(yangsheng);
        actionBar.addTab(junshi);
        actionBar.addTab(qinzi);
        actionBar.addTab(yuedu);
        actionBar.addTab(shouji);
        
        
		
	}

@Override
    protected void onStop()
    {
        System.out.println("MainActivity--->onStop");
        super.onStop();
    }
/**
 * 实现ActionBar.TabListener接口，构造函数中把fragment传进来了，为了更好的控制fragment
 */
class MyTabListener implements TabListener{

	  // 接收每个Tab对应的Fragment，操作
    private Fragment fragment;


    public MyTabListener(Fragment fragment)
    {
        this.fragment = fragment;
    }
    @Override
    public void onTabReselected(Tab tab, FragmentTransaction ft)
    {
    }
    @Override
    // 当Tab被选中的时候添加对应的Fragment
    public void onTabSelected(Tab tab, FragmentTransaction ft)
    {
        ft.replace(R.id.main, fragment, null);
//这里要不然使用 ft.replace(R.id.context, fragment, null)，之后不能使用commit(),要不然会报错。或者注释这条语句，使用下面注释的语句
        
       // FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//试用fragment替换activity中的main组件
//fragmentTransaction.replace(R.id.context, fragment);
//提交事物
//fragmentTransaction.commit();
//提交事物

	}
	@Override
	public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}
}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
