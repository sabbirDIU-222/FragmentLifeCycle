package com.example.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLife extends Fragment {

    public FragmentLife() {
        // Required empty public constructor
    }


    // activity life cycle


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //Called when a fragment is first attached to its context. onCreate(Bundle) will be called after this.

        Toast.makeText(getContext(),"on Attach",Toast.LENGTH_SHORT).show();
        Log.e("fragmentlifecycle","on attach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getContext(),"on create",Toast.LENGTH_SHORT).show();
        Log.e("fragmentlifecycle","on create");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getContext(),"on create view",Toast.LENGTH_SHORT).show();
        Log.e("fragmentlifecycle","on create view ");
        return inflater.inflate(R.layout.fragment_life, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Toast.makeText(getContext(),"on Activity Created",Toast.LENGTH_SHORT).show();
        Log.e("fragmentlifecycle","on activity created");
    }


    @Override
    public void onStart() {
        super.onStart();

        Toast.makeText(getContext(),"on start",Toast.LENGTH_SHORT).show();
        Log.e("fragmentlifecycle","on start");
    }

    @Override
    public void onResume() {
        super.onResume();

        Toast.makeText(getContext(),"on Resume",Toast.LENGTH_SHORT).show();
        Log.e("fragmentlifecycle","on resume");
    }
    // after called on Resume method the fragment is ready to show


    @Override
    public void onPause() {
        super.onPause();

        Toast.makeText(getContext(),"on pause",Toast.LENGTH_SHORT).show();
        Log.e("fragmentlifecycle","on pause");
    }

    @Override
    public void onStop() {
        super.onStop();

        Toast.makeText(getContext(),"on stop",Toast.LENGTH_SHORT).show();
        Log.e("fragmentlifecycle","on stop");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getContext(),"on destroy view",Toast.LENGTH_SHORT).show();
        Log.e("fragmentlifecycle","on destroy view");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getContext(),"on destroy",Toast.LENGTH_SHORT).show();
        Log.e("fragmentlifecycle","on destroy");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getContext(),"on detach",Toast.LENGTH_SHORT).show();
        Log.e("fragmentlifecycle","on detach");
    }



}
