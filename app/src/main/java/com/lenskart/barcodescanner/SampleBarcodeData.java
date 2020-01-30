package com.lenskart.barcodescanner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SampleBarcodeData {

    public Map<String, BarcodeData> getActualBarcodesDataSet() {
        return actualBarcodesDataSet;
    }

    public void setActualBarcodesDataSet(Map<String, BarcodeData> actualBarcodesDataSet) {
        this.actualBarcodesDataSet = actualBarcodesDataSet;
    }

    Map<String, BarcodeData> actualBarcodesDataSet = new HashMap<>();

    SampleBarcodeData(){
        actualBarcodesDataSet.put("AAA000653155", new BarcodeData("AAA000653155", "John jacobs", "Eyeglass", "70140"));
        actualBarcodesDataSet.put("AAA000666504", new BarcodeData("AAA000666504", "John jacobs", "Eyeglass", "70140"));
        actualBarcodesDataSet.put("III374197", new BarcodeData("III374197", "John jacobs", "Eyeglass", "VC 0323"));
        actualBarcodesDataSet.put("III374198", new BarcodeData("III374198", "John jacobs", "Eyeglass", "VC 0323"));
    }
}
