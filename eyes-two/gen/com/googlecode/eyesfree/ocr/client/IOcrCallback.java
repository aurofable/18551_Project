/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/capstone18551/code/tess/eyes-two/src/com/googlecode/eyesfree/ocr/client/IOcrCallback.aidl
 */
package com.googlecode.eyesfree.ocr.client;
// Declare the interface.

public interface IOcrCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.googlecode.eyesfree.ocr.client.IOcrCallback
{
private static final java.lang.String DESCRIPTOR = "com.googlecode.eyesfree.ocr.client.IOcrCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.googlecode.eyesfree.ocr.client.IOcrCallback interface,
 * generating a proxy if needed.
 */
public static com.googlecode.eyesfree.ocr.client.IOcrCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.googlecode.eyesfree.ocr.client.IOcrCallback))) {
return ((com.googlecode.eyesfree.ocr.client.IOcrCallback)iin);
}
return new com.googlecode.eyesfree.ocr.client.IOcrCallback.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onResult:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
com.googlecode.eyesfree.ocr.client.OcrResult _arg1;
if ((0!=data.readInt())) {
_arg1 = com.googlecode.eyesfree.ocr.client.OcrResult.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onResult(_arg0, _arg1);
return true;
}
case TRANSACTION_onCompleted:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.util.List<com.googlecode.eyesfree.ocr.client.OcrResult> _arg1;
_arg1 = data.createTypedArrayList(com.googlecode.eyesfree.ocr.client.OcrResult.CREATOR);
this.onCompleted(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.googlecode.eyesfree.ocr.client.IOcrCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public void onResult(long token, com.googlecode.eyesfree.ocr.client.OcrResult results) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(token);
if ((results!=null)) {
_data.writeInt(1);
results.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void onCompleted(long token, java.util.List<com.googlecode.eyesfree.ocr.client.OcrResult> results) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(token);
_data.writeTypedList(results);
mRemote.transact(Stub.TRANSACTION_onCompleted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onResult(long token, com.googlecode.eyesfree.ocr.client.OcrResult results) throws android.os.RemoteException;
public void onCompleted(long token, java.util.List<com.googlecode.eyesfree.ocr.client.OcrResult> results) throws android.os.RemoteException;
}
