#include "com_itea_myfirstjni_MainActivity.h"

JNIEXPORT jstring JNICALL Java_com_itea_myfirstjni_MainActivity_getContent
  (JNIEnv *pEnv, jobject pThis) {
	return (*pEnv)->NewStringUTF(pEnv, "Hihihi");
}

JNIEXPORT jstring JNICALL Java_com_itea_myfirstjni_MainActivity_mySummation
  (JNIEnv *pEnv, jobject pThis) {

	int a = 5;
	int b = 4;
	int c = 0;
	c = a + b;

	return c;

}
