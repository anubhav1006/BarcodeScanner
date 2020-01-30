package com.lenskart.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.security.AccessController.getContext;

public class ListData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

        SampleBarcodeData sampleBarcodeData = new SampleBarcodeData();
        Map<String, BarcodeData> barcodesMap = sampleBarcodeData.getActualBarcodesDataSet();

        final List<BarcodeData> barcodes = new ArrayList<>(barcodesMap.values());
        Collections.reverse(barcodes);

        BarcodeAdapter barcodeAdapter;
        RecyclerView barcodesRecyclerView;
        barcodesRecyclerView = findViewById(R.id.ContactsRecyclerView);

        OnElementClickListener ElementClickListener = new OnElementClickListener() {
            @Override
            public void setElementOnClickListener(int position) {
                Log.i("TAG", String.valueOf(barcodes.get(position)));
            }
        };

        barcodeAdapter = new BarcodeAdapter(getApplicationContext(),barcodes,ElementClickListener);

        barcodeAdapter.notifyDataSetChanged();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        barcodesRecyclerView.setLayoutManager(layoutManager);
        barcodesRecyclerView.setItemAnimator(new DefaultItemAnimator());
        barcodesRecyclerView.setAdapter(barcodeAdapter);

    }
}
