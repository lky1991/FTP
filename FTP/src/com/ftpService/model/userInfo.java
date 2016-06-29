package com.ftpService.model;

/**
* @ClassName: userInfo  
* @Description: 用户的基本信息(开发者用户和临时用户)
* @author wally@hudongpai.com
* @date 2016-6-27 下午04:12:18
 */
public class userInfo {
    private Integer uid; 

    private String token;  //开发者用户的token

    private String ftpAccount; //用户的ftp账号

    private Boolean type; //用户类型

    private String expire; //token 创建时间

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getFtpAccount() {
        return ftpAccount;
    }

    public void setFtpAccount(String ftpAccount) {
        this.ftpAccount = ftpAccount == null ? null : ftpAccount.trim();
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire == null ? null : expire.trim();
    }

	@Override
	public String toString() {
		return "userInfo [uid=" + uid + ", token=" + token + ", ftpAccount="
				+ ftpAccount + ", type=" + type + ", expire=" + expire + "]";
	}
    
}