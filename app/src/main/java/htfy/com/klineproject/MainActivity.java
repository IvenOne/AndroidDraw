package htfy.com.klineproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager mViewPage;
    TableLayout mTablayout;
    List<PageModel> list = new ArrayList<>();
    {
//        list.add(new PageModel(R.layout.sample_color,R.layout));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Observable.just(1, 2, 3, 4)
//                .subscribeOn(Schedulers.io()) // 指定 subscribe() 发生在 IO 线程
//                .observeOn(Schedulers.computation()) // 指定 Subscriber 的回调发生在主线程
//                .subscribe(new Observer<Integer>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(Integer integer) {
//                        Log.d("wdd", "My Thread Id is " + Thread.currentThread().getName() + ":" + Thread.currentThread().getId());
//                        Log.d("wdd", "This is a test " + integer);
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
//
//
//        Observable.just("Images/logo.png")
//                .map(new Function<String, Bitmap>() {
//
//                    @Override
//                    public Bitmap apply(String s) throws Exception {
//                        return null;
//                    }
//                })
//                .subscribe(new Consumer<Bitmap>() {
//                    @Override
//                    public void accept(Bitmap bitmap) throws Exception {
//
//                    }
//                });
        mViewPage = findViewById(R.id.pager);
        mTablayout = findViewById(R.id.main_tb);


        mViewPage.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return null;
            }

            @Override
            public int getCount() {
                return 0;
            }
        });
    }

    class PageModel{
        int sampleLayoutRes;
        int practiceLayoutRes;
        int titleRes;

        public PageModel(int sampleLayoutRes, int practiceLayoutRes, int titleRes) {
            this.sampleLayoutRes = sampleLayoutRes;
            this.practiceLayoutRes = practiceLayoutRes;
            this.titleRes = titleRes;
        }
    }
}
