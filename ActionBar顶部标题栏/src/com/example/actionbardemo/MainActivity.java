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
		
		
		  // �õ�Activity��ActionBar
        ActionBar actionBar = getActionBar();
        // ����AcitonBar�Ĳ���ģ��
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        // ��Activity��ͷ��ȥ��
        actionBar.setDisplayShowTitleEnabled(false);
        // ����Tab
        Tab lvxing = actionBar.newTab().setText("����");
        Tab gaoxiao = actionBar.newTab().setText("��Ц");
        Tab shoucang = actionBar.newTab().setText("�ղ�");
        Tab qiche = actionBar.newTab().setText("����");
        Tab shishang = actionBar.newTab().setText("ʱ��");
        Tab qinggan = actionBar.newTab().setText("���");
        Tab youxi = actionBar.newTab().setText("��Ϸ");
        Tab shipin=actionBar.newTab().setText("��Ƶ");
        
        
        
        Tab jianshen = actionBar.newTab().setText("����");
        Tab yangsheng = actionBar.newTab().setText("����");
        Tab junshi = actionBar.newTab().setText("����");
        Tab qinzi= actionBar.newTab().setText("����");
        Tab yuedu=actionBar.newTab().setText("�Ķ�");
        Tab shouji=actionBar.newTab().setText("�ֻ�");
      
        // Ϊÿ��Tab���Listener
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
        
        
        
        
        
        
        // ��Tab����ActionBar��
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
 * ʵ��ActionBar.TabListener�ӿڣ����캯���а�fragment�������ˣ�Ϊ�˸��õĿ���fragment
 */
class MyTabListener implements TabListener{

	  // ����ÿ��Tab��Ӧ��Fragment������
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
    // ��Tab��ѡ�е�ʱ����Ӷ�Ӧ��Fragment
    public void onTabSelected(Tab tab, FragmentTransaction ft)
    {
        ft.replace(R.id.main, fragment, null);
//����Ҫ��Ȼʹ�� ft.replace(R.id.context, fragment, null)��֮����ʹ��commit(),Ҫ��Ȼ�ᱨ������ע��������䣬ʹ������ע�͵����
        
       // FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//����fragment�滻activity�е�main���
//fragmentTransaction.replace(R.id.context, fragment);
//�ύ����
//fragmentTransaction.commit();
//�ύ����

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
