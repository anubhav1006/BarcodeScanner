package com.lenskart.barcodescanner;

import com.google.android.gms.vision.barcode.Barcode;

import java.util.HashSet;
import java.util.Set;

public class SampleBarcodes {
    Set<String> actualBarcodesSet = new HashSet<>();
    SampleBarcodes(){
        actualBarcodesSet.add("AAA000653155");
        actualBarcodesSet.add("AAA000666504");
        actualBarcodesSet.add("III374197");
        actualBarcodesSet.add("III374198");
    }
}
