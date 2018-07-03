package htfy.com.klineproject;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

public class PageFragment extends Fragment {
    @LayoutRes int sampleLayoutRes;
    @LayoutRes int practicalLayoutRes;

    public static PageFragment newInstance(int sampleLayoutRes,int practicalLayoutRes){
        PageFragment fragment = new PageFragment();
        Bundle args = new Bundle();
        args.putInt("sampleLayoutRes",sampleLayoutRes);
        args.putInt("practicalLayoutRes",practicalLayoutRes);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_layout,container,false);

        ViewStub sampleStub = view.findViewById(R.id.sampleStub);
        sampleStub.setLayoutResource(sampleLayoutRes);
        sampleStub.inflate();

        ViewStub practiceStub = view.findViewById(R.id.practiceStub);
        practiceStub.setLayoutResource(practicalLayoutRes);
        practiceStub.inflate();

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if(args!= null){
            sampleLayoutRes = args.getInt("sampleLayoutRes");
            practicalLayoutRes = args.getInt("practicalLayoutRes");
        }
    }
}
