package co.molzol.molzol;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {
    boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                search();
            }
        });

        AppBarLayout appBarLayout = (AppBarLayout)findViewById(R.id.app_bar);
        appBarLayout.addOnOffsetChangedListener(new AppBarStateChangeListener() {
            @Override
            public void onStateChanged(AppBarLayout appBarLayout, State state) {
                Log.d("STATE", state.name());
                if(state.name().equals("COLLAPSED")){
                    flag = true;
                } else {
                    flag = false;
                }
                invalidateOptionsMenu();
            }
        });
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu){
        MenuItem item = menu.findItem(R.id.action_search);
        item.setVisible(flag);
        return super.onPrepareOptionsMenu(menu);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        } else */
        if(id == R.id.action_search) {
            search();
        }
        return super.onOptionsItemSelected(item);
    }

    public void goToStore(View v){

        Log.d("store", "store Clicked");
        String url = null;
        if (v.getId() == R.id.flipKartImage) {
            url = "http://dl.flipkart.com/dl/?affid=careeramr";
        } else if (v.getId() == R.id.amazonImage){
            url = "http://www.amazon.in/?tag=mol02-21";
        } else if (v.getId() == R.id.snapDealImage){
            url ="http://www.snapdeal.com/?utm_source=aff_prog&utm_campaign=afts&offer_id=17&aff_id=71441";
        } else if (v.getId() == R.id.infibeamImage){
            url = "http://www.infibeam.com/?track=caree";
        } else if (v.getId() == R.id.myntraImage){
            url = "http://www.myntra.com/";
        } else if (v.getId() == R.id.ebayImage){
            url = "http://www.ebay.in";
        } else if (v.getId() == R.id.shopcluesImage){
            url = "http://www.shopclues.com/";
        } else if (v.getId() == R.id.jabongImage){
            url = "http://www.jabong.com/";
        } else if (v.getId() == R.id.offer1){
            url = "http://www.snapdeal.com/offers/exclusive-launches?utm_source=aff_prog&utm_campaign=afts&offer_id=17&aff_id=71441";
        }  else if (v.getId() == R.id.offer2){
            url = "http://www.snapdeal.com/offers/deal-of-the-day?utm_source=aff_prog&utm_campaign=afts&offer_id=17&aff_id=71441";
        }  else if (v.getId() == R.id.offer3){
            url = "http://www.amazon.in/b/?ie=UTF8&node=5331319031&rw_useCurrentProtocol=1&tag=mol02-21";
        }  else if (v.getId() == R.id.offer4){
            url = "http://www.amazon.in/b?node=1592905031&ref_=as_acmain_dotd&tag=mol02-21";
        } else if (v.getId() == R.id.offer5){
            url = "http://fkrt.it/duZgFuuuuN";
        } else if (v.getId() == R.id.offer6){
            url = "http://fkrt.it/Mt3MYNNNNN";
        }

        if (null != url) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        }
    }

    private void search() {
        Intent intent = new Intent(this, SearchResultActivity.class);
        //intent.putExtra(SCAN_RESULT, scanContent);
        startActivity(intent);
    }

}