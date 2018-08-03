package instapay.instapay.wadi.makkah.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney, Australia, and move the camera.
        LatLng sydney = new LatLng(21.3666652, 40.00166666);
        LatLng A = new LatLng(21.35462, 39.98401);
        LatLng B = new LatLng(21.254621, 39.883900);
        LatLng C= new LatLng(20.854644, 39.784019);
        LatLng E= new LatLng(20.854644, 39.994019);
        LatLng F= new LatLng(20.744644, 39.694019);
        LatLng G= new LatLng(20.774644, 39.664019);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney").icon(BitmapDescriptorFactory.fromResource(R.drawable.a)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.addMarker(new MarkerOptions().position(A).title("A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(A));
        mMap.addMarker(new MarkerOptions().position(B).title("B"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(B));
        mMap.addMarker(new MarkerOptions().position(C).title("C"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(C));
        mMap.addMarker(new MarkerOptions().position(E).title("E"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(E));
        mMap.addMarker(new MarkerOptions().position(F).title("F"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(F));
        mMap.addMarker(new MarkerOptions().position(G).title("G"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(G));
//        usrssdataLAN.addValueEventListener(new  ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//
//              LatLng newLocation = new LatLng(
//                        dataSnapshot.getValue(Long.class),
//                     dataSnapshot.getValue(Long.class)
//               );
//                mMap.addMarker(new MarkerOptions()
//                        .position(newLocation)
//                        .title("Asma"));
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//
//        });
//    }


    }}






