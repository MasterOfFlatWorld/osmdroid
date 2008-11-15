package org.andnav.osm.samples;

import org.andnav.osm.OSMMapActivity;

import android.location.Location;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Sample code to show how easy it is to contribute to the OpenStreetMap Project.
 * @author Nicolas Gramlich
 */
public class SampleOSMContributor extends OSMMapActivity {
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		/* You need to do exactly nothing, 
		 * to contribute to the OSM-Project, 
		 * except extending from OpenStreetMapActivity 
		 * and passing true to its onCreate(...) .*/
		super.onCreate(savedInstanceState, false);
		final TextView tv = new TextView(this);
		tv.setText("While reading this, your GPS position is recorded and when you exit this application, your route will get uploaded to the OpenStreetMap-Project.");
		this.setContentView(tv);
	}

	@Override
	public void onLocationChanged(Location loc) {
		// Nothing to do...
	}

	@Override
	public void onLocationLost() {
		// Nothing to do...
	}
}