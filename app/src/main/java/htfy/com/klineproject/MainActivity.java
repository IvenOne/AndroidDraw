package htfy.com.klineproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager mViewPage;
    TabLayout mTablayout;
    List<PageModel> list = new ArrayList<>();
    {
        list.add(new PageModel(R.layout.sample_color,R.layout.practicel_color,R.string.drawColor));
        list.add(new PageModel(R.layout.sample_point,R.layout.practice_point,R.string.drawPoint));
        list.add(new PageModel(R.layout.sample_line,R.layout.practice_line,R.string.drawLine));
        list.add(new PageModel(R.layout.sample_circle,R.layout.practice_circle,R.string.drawCircle));
        list.add(new PageModel(R.layout.sample_arc,R.layout.practice_arc,R.string.drawArc));
        list.add(new PageModel(R.layout.sample_oval,R.layout.practice_oval,R.string.drawOval));
        list.add(new PageModel(R.layout.sample_rect,R.layout.practice_rect,R.string.drawRect));
        list.add(new PageModel(R.layout.sample_round_rect,R.layout.practice_round_rect,R.string.drawRoundRect));
        list.add(new PageModel(R.layout.sample_path,R.layout.practice_path,R.string.drawPath));
        list.add(new PageModel(R.layout.sample_histogram,R.layout.practice_histogram,R.string.drawHistorgram));
        list.add(new PageModel(R.layout.sample_pie_chat,R.layout.practice_pie_chat,R.string.drawPieChat));
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
                PageFragment p = PageFragment.newInstance(list.get(i).sampleLayoutRes,list.get(i).practiceLayoutRes);
                return p;
            }

            @Override
            public int getCount() {
                return list.size();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return getString(list.get(position).titleRes);
            }
        });

        mTablayout.setupWithViewPager(mViewPage);
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
