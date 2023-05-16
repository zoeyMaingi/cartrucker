package com.example.myproject

import android.content.pm.PackageManager
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.firebase.database.DatabaseReference
import kotlin.math.log

internal class MapsActivity :AppCompatActivity(), OnMapReadyCallback {
    private lateinit var map:GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val mapFragment= supportFragmentManager
            .findFragmentById(R.id.map) as supportMapFragment
        mapFragment.getMapAsync(this)
        setupLocClient()
    }
    private fun requestLocPermission(){
        ActivityCompat.requestPermissions(this,
        arrayOf(Manifest.permission.Access_FINE_LOCATION)
                REQUEST_LOCATION)
    }
    companion object{
        private const val REQUEST_LOCATION=1
        private const val ="MapsActivity"
    }
    private fun getCurrentLocation(){
     if (ActivityCompat.CheckSelfPermission(this,
         Manifest.permission.ACCESS_FINE_LOCATION)
         PackageManager.PERMISSION_GRANTED){
         requestLocPermission()
     }else{
         fusedLocClient.LastLocation.addOnCompleteListener{
             val location = it.result

             val database: FirebaseDatabase = FirebaseDatabase.getInstance()
             val ref: DatabaseReference = database.getReference("test")
             if (location !=null ) {

                 val latLng = LatLng(location.latitude, location.longitude)
                 map.addMarker(Markeroptions().position(LatLng)
                     .title("You are currently here!"))
                 val update = CameraUpdateFactory.newLatLngZoom(latLng, 16.0f)

                 map.moveCamera(update)
                 ref.setValue(location)
             }else{
                 Log.e(tag,"No location found")
             }

         }
     }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_LOCATION){
            if (grantResults.size ==1 && grantResults[0]==
                    PackageManager.PERMISSION_GRANTED){
                getCurrentLocation()
            }else{
                Log.e(Tag,"Location permission has been denied")
            }
        }
    }
}
