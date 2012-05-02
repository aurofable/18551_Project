/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/capstone18551/code/tess/eyes-two/src/com/googlecode/eyesfree/ocr/client/IOcr.aidl
 */
package com.googlecode.eyesfree.ocr.client;
// Declare the interface.

public interface IOcr extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.googlecode.eyesfree.ocr.client.IOcr
{
private static final java.lang.String DESCRIPTOR = "com.googlecode.eyesfree.ocr.client.IOcr";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.googlecode.eyesfree.ocr.client.IOcr interface,
 * generating a proxy if needed.
 */
public static com.googlecode.eyesfree.ocr.client.IOcr asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.googlecode.eyesfree.ocr.client.IOcr))) {
return ((com.googlecode.eyesfree.ocr.client.IOcr)iin);
}
return new com.googlecode.eyesfree.ocr.client.IOcr.Stub.Proxy(obj);
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
case TRANSACTION_setCallback:
{
data.enforceInterface(DESCRIPTOR);
com.googlecode.eyesfree.ocr.client.IOcrCallback _arg0;
_arg0 = com.googlecode.eyesfree.ocr.client.IOcrCallback.Stub.asInterface(data.readStrongBinder());
this.setCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_enqueueData:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
com.googlecode.eyesfree.ocr.client.Ocr.Parameters _arg1;
if ((0!=data.readInt())) {
_arg1 = com.googlecode.eyesfree.ocr.client.Ocr.Parameters.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
long _result = this.enqueueData(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_enqueueFile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.googlecode.eyesfree.ocr.client.Ocr.Parameters _arg1;
if ((0!=data.readInt())) {
_arg1 = com.googlecode.eyesfree.ocr.client.Ocr.Parameters.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
long _result = this.enqueueFile(_arg0, _arg1);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_cancel:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
boolean _result = this.cancel(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stop:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.stop();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_reloadLanguages:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.reloadLanguages();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getAvailableLanguages:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<com.googlecode.eyesfree.ocr.client.Language> _result = this.getAvailableLanguages();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getTessdata:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getTessdata();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getDatapath:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getDatapath();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getVersion:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getVersion();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.googlecode.eyesfree.ocr.client.IOcr
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
public void setCallback(com.googlecode.eyesfree.ocr.client.IOcrCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public long enqueueData(byte[] jpegData, com.googlecode.eyesfree.ocr.client.Ocr.Parameters params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(jpegData);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_enqueueData, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public long enqueueFile(java.lang.String filename, com.googlecode.eyesfree.ocr.client.Ocr.Parameters params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(filename);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_enqueueFile, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean cancel(long taskId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(taskId);
mRemote.transact(Stub.TRANSACTION_cancel, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean stop() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean reloadLanguages() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reloadLanguages, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<com.googlecode.eyesfree.ocr.client.Language> getAvailableLanguages() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<com.googlecode.eyesfree.ocr.client.Language> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAvailableLanguages, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(com.googlecode.eyesfree.ocr.client.Language.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getTessdata() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTessdata, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getDatapath() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDatapath, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getVersion() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVersion, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_setCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_enqueueData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_enqueueFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_cancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_reloadLanguages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getAvailableLanguages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getTessdata = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getDatapath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
public void setCallback(com.googlecode.eyesfree.ocr.client.IOcrCallback callback) throws android.os.RemoteException;
public long enqueueData(byte[] jpegData, com.googlecode.eyesfree.ocr.client.Ocr.Parameters params) throws android.os.RemoteException;
public long enqueueFile(java.lang.String filename, com.googlecode.eyesfree.ocr.client.Ocr.Parameters params) throws android.os.RemoteException;
public boolean cancel(long taskId) throws android.os.RemoteException;
public boolean stop() throws android.os.RemoteException;
public boolean reloadLanguages() throws android.os.RemoteException;
public java.util.List<com.googlecode.eyesfree.ocr.client.Language> getAvailableLanguages() throws android.os.RemoteException;
public java.lang.String getTessdata() throws android.os.RemoteException;
public java.lang.String getDatapath() throws android.os.RemoteException;
public int getVersion() throws android.os.RemoteException;
}
