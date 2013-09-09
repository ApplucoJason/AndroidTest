LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := demolib
LOCAL_SRC_FILES := com_itea_myfirstjni_MainActivity.c
include $(BUILD_SHARED_LIBRARY)