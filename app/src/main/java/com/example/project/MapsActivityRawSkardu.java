package com.example.project;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


// [START maps_marker_on_map_ready]
public class MapsActivityRawSkardu extends AppCompatActivity
        implements OnMapReadyCallback {

    // [START_EXCLUDE]
    // [START maps_marker_get_map_async]
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps_raw_skardu);

        // Get the SupportMapFragment and request notification when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    GoogleMapOptions options = new GoogleMapOptions();

    // [END maps_marker_get_map_async]
    // [END_EXCLUDE]

    // [START_EXCLUDE silent]

    // [END_EXCLUDE]
    // [START maps_marker_on_map_ready_add_marker]
    @Override
    public void onMapReady(GoogleMap googleMap) {
        googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        options.mapType(GoogleMap.MAP_TYPE_SATELLITE).compassEnabled(true).rotateGesturesEnabled(true).tiltGesturesEnabled(true);
        LatLng skardu = new LatLng(35.326170, 75.548927);
        googleMap.addMarker(new MarkerOptions().position(skardu).title("SKARDU"));
        // [START_EXCLUDE silent]
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(skardu));
        // [END_EXCLUDE]
    }
    // [END maps_marker_on_map_ready_add_marker]
}
// [END maps_marker_on_map_ready]
