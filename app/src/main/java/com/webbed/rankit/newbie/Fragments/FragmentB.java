package com.webbed.rankit.newbie.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.webbed.rankit.newbie.Adapters.FragmentBadapter;
import com.webbed.rankit.newbie.main.EventDescription;
import com.webbed.rankit.newbie.Getters.Quiz;
import com.webbed.rankit.newbie.R;

/**
 * Created by R Ankit on 2/4/2015.
 */
public class FragmentB extends Fragment {

    private ListView mListView;
    private FragmentBadapter mFragmentBadapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_b,container,false);
        mListView= (ListView) view.findViewById(R.id.main_list_view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mFragmentBadapter = new FragmentBadapter(getActivity());
        mListView.setAdapter(mFragmentBadapter);

        final String[] text= Quiz.getEventName();
        final int[] image=Quiz.getEventImage();
        final String[] des=getActivity().getResources().getStringArray(R.array.quiz);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(getActivity(),EventDescription.class);
                intent.putExtra("image_resourse",image[position]);
                intent.putExtra("title",text[position]);
                intent.putExtra("desc",des[position]);
                startActivity(intent);
                System.gc();
            }
        });
    }
}
