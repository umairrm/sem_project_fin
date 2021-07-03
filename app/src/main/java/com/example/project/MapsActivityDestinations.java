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
public class MapsActivityDestinations extends AppCompatActivity
        implements OnMapReadyCallback {

    // [START_EXCLUDE]
    // [START maps_marker_get_map_async]
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps_destinations);

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
        LatLng hunza = new LatLng(36.316622, 74.649996);
        googleMap.addMarker(new MarkerOptions().position(hunza).title("HUNZA"));
        // [START_EXCLUDE silent]
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(hunza));



        LatLng naran = new LatLng(34.548016, 73.351367);
        googleMap.addMarker(new MarkerOptions().position(naran).title("NARAN VALLEY"));
        // [START_EXCLUDE silent]
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(naran));
        // [END_EXCLUDE]


        LatLng margalla = new LatLng(33.743596, 73.022822);
        googleMap.addMarker(new MarkerOptions().position(margalla).title("MARGALLA HILLS"));
        // [START_EXCLUDE silent]
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(margalla));
        // [END_EXCLUDE]


        LatLng gwadar = new LatLng(25.514961, 65.519379);
        googleMap.addMarker(new MarkerOptions().position(gwadar).title("GWADAR"));
        // [START_EXCLUDE silent]
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(gwadar));
        // [END_EXCLUDE]


        LatLng nangaparbat = new LatLng(35.234151, 74.588532);
        googleMap.addMarker(new MarkerOptions().position(nangaparbat).title("NANGA PARBAT"));
        // [START_EXCLUDE silent]
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(nangaparbat));
        // [END_EXCLUDE]


        LatLng kafirkoot = new LatLng(32.502836, 71.335502);
        googleMap.addMarker(new MarkerOptions().position(kafirkoot).title("KAFIR KOOT TEMPLES"));
        // [START_EXCLUDE silent]
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(kafirkoot));
        // [END_EXCLUDE]


        LatLng pharwala = new LatLng(33.618505, 73.300103);
        googleMap.addMarker(new MarkerOptions().position(pharwala).title("PHARWALA"));
        // [START_EXCLUDE silent]
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(pharwala));
        // [END_EXCLUDE]


        LatLng bhamala = new LatLng(33.832717, 72.975912);
        googleMap.addMarker(new MarkerOptions().position(bhamala).title("BHAMALA STUPA"));
        // [START_EXCLUDE silent]
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(bhamala));
        // [END_EXCLUDE]


        LatLng fairymed = new LatLng(35.387316, 74.578550);
        googleMap.addMarker(new MarkerOptions().position(fairymed).title("FAIRY MEADOWS"));
        // [START_EXCLUDE silent]
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(fairymed));
        // [END_EXCLUDE]



    }
    // [END maps_marker_on_map_ready_add_marker]
}
// [END maps_marker_on_map_ready]
