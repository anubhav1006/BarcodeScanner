package com.lenskart.barcodescanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BarcodeAdapter extends RecyclerView.Adapter<BarcodeAdapter.ContactViewHolder> {
    android.content.Context Context;
    List<BarcodeData> Barcodes;
    OnElementClickListener ELementClickListener;
    public BarcodeAdapter(Context context, List <BarcodeData> barcodes, OnElementClickListener onElementClickListener)
    {
        this.Context = context;
        this.Barcodes = barcodes;
        this.ELementClickListener = onElementClickListener;
    }
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ContactViewHolder contactViewHolder = null;
        View contactView = LayoutInflater.from(this.Context).inflate(R.layout.activity_data,parent,false);
        contactViewHolder = new ContactViewHolder(contactView);
        return contactViewHolder;
    }
    @Override
    public void onBindViewHolder(ContactViewHolder holder, final int position) {
        final ContactViewHolder contactViewHolder = (ContactViewHolder)holder;
        BarcodeData barcode = Barcodes.get(position);
        contactViewHolder.barcode.setText(barcode.getBarcode());
        contactViewHolder.product_id.setText(barcode.getProductId());
        contactViewHolder.brand.setText(barcode.getBrand());
        contactViewHolder.category.setText(barcode.getCategory());
    }
    @Override
    public int getItemCount() {return Barcodes.size();}
    class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView barcode, product_id, brand, category;
        public ContactViewHolder(View itemView) {
            super(itemView);
            barcode = itemView.findViewById(R.id.barcode);
            product_id = itemView.findViewById(R.id.product_id);
            brand = itemView.findViewById(R.id.brand);
            category = itemView.findViewById(R.id.category);
        }}}

