package com.maxstlab.testapp5gmec;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.io.File;

public class FileDownloadAct extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filedownload_layout);

        findViewById(R.id.btnFileDownload).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnFileDownload:
                startActivity(new Intent(getApplicationContext(), FileDownloadAct.class));
                break;
            case R.id.btnLatencySocket:
                startActivity(new Intent(getApplicationContext(), LatencyTestSocketAct.class));
                break;
            case R.id.btnLatencyPing:
                startActivity(new Intent(getApplicationContext(), LatencyTestPingAct.class));
                break;
        }
    }
}
