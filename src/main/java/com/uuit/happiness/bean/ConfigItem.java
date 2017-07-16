package com.uuit.happiness.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConfigItem {

  public static final String INSTALL = "INSTALL";

  public static final String DEFAULT_DB_TYPE = "DEFAULT_DB_TYPE";
  public static final String DEFAULT_DB_SERVER = "DEFAULT_DB_SERVER";
  public static final String DEFAULT_DB_PORT = "DEFAULT_DB_PORT";
  public static final String DEFAULT_DB_NAME = "DEFAULT_DB_NAME";
  public static final String DEFAULT_DB_USER = "DEFAULT_DB_USER";
  public static final String DEFAULT_DB_PASSWORD = "DEFAULT_DB_PASSWORD";

  public static final String DEFAULT_MONGO_SERVER = "DEFAULT_MONGO_SERVER";
  public static final String DEFAULT_MONGO_PORT = "DEFAULT_MONGO_PORT";
  public static final String DEFAULT_MONGO_NAME = "DEFAULT_MONGO_NAME";
  public static final String DEFAULT_MONGO_USER = "DEFAULT_MONGO_USER";
  public static final String DEFAULT_MONGO_PASSWORD = "DEFAULT_MONGO_PASSWORD";

  public static final String DEFAULT_QINIU_AK = "DEFAULT_QINIU_AK";
  public static final String DEFAULT_QINIU_SK = "DEFAULT_QINIU_SK";
  public static final String DEFAULT_QINIU_BUCKET = "DEFAULT_QINIU_BUCKET";
  public static final String DEFAULT_QINIU_DOMAIN = "DEFAULT_QINIU_DOMAIN";

  public static final String DEFAULT_SMTP_SERVER = "DEFAULT_SMTP_SERVER";
  public static final String DEFAULT_SMTP_PORT = "DEFAULT_SMTP_PORT";
  public static final String DEFAULT_SMTP_USERNAME = "DEFAULT_SMTP_USERNAME";
  public static final String DEFAULT_SMTP_PASSWORD = "DEFAULT_SMTP_PASSWORD";

  public static final String SYSTEM_NAME = "SYSTEM_NAME";
  public static final String SYSTEM_ALIAS = "SYSTEM_ALIAS";

  public static final String SYSTEM_ALLOW_SET_TARGET = "SYSTEM_ALLOW_SET_TARGET";

  public static final String SMS_TYPE = "SMS_TYPE";
  public static final String SMS_189_APP_ID = "SMS_189_APP_ID";
  public static final String SMS_189_APP_SECRET = "SMS_189_APP_SECRET";
  public static final String SMS_189_TEMPLATE_INIT_PASSWORD = "SMS_189_TEMPLATE_INIT_PASSWORD";

  public static final String SMS_9NUO_CODE = "SMS_9NUO_CODE";
  public static final String SMS_9NUO_USERNAME = "SMS_9NUO_USERNAME";
  public static final String SMS_9NUO_PASSWORD = "SMS_9NUO_PASSWORD";

  @Id
  private String name;
  private String value;

  public ConfigItem() {}

  public ConfigItem(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}
