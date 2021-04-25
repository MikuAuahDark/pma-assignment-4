package id.co.npad93.pm.t4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ElementListFragment extends Fragment {
    public ElementListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_element_list, container, false);

        RecyclerView elementRecyclerview = root.findViewById(R.id.recyclerView2);
        elementRecyclerview.setHasFixedSize(true);
        elementRecyclerview.setLayoutManager(new LinearLayoutManager(root.getContext()));
        elementRecyclerview.setAdapter(new ElementDataAdapter());

        return root;
    }
}