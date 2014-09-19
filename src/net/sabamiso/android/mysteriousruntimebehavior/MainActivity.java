package net.sabamiso.android.mysteriousruntimebehavior;

import com.example.ext.ClassExt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ClassExt cls = new ClassExt();

		TextView textRuntimeType;
		textRuntimeType = (TextView) findViewById(R.id.textRuntimeType);
		textRuntimeType.setText(cls.getRuntimeType());
	}
}
