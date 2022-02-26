package com.cannabis.cogollo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cannabis.cogollo.R
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class SeekFragment : Fragment(), OnMapReadyCallback {

    lateinit var mapView: MapView;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v = inflater.inflate(R.layout.fragment_seek, container, false)

        //mapView = v.findViewById(R.id.map) as MapView
        //mapView.onCreate(savedInstanceState)
        //mapView.getMapAsync(this)

        return v
    }

    companion object {
        fun newInstance(): SeekFragment = SeekFragment()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onStop() {
        super.onStop()
        mapView.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }

    override fun onMapReady(googleMap: GoogleMap) {
        val mGoogleMap = googleMap
        mGoogleMap.mapType = GoogleMap.MAP_TYPE_NORMAL
        mGoogleMap.getUiSettings().setZoomControlsEnabled(true);
        mGoogleMap.addMarker(MarkerOptions().position(LatLng(6.02,-75.4)))
        mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(LatLng(6.02,-75.4)))
        mGoogleMap.setMinZoomPreference(10.0F)
    }


}