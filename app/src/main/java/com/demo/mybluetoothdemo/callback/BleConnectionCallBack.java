package com.demo.mybluetoothdemo.callback;

import android.bluetooth.BluetoothGattCharacteristic;

/**
 * Created by admin on 2017/11/20.
 */

public interface BleConnectionCallBack {
    public void onRecive(BluetoothGattCharacteristic data_char);

    public void onSuccessSend();

    public void onDisconnect();
}
