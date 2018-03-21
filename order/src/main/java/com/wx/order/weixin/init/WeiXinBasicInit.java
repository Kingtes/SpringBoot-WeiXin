package com.wx.order.weixin.init;

import com.wx.order.weixin.model.WeiXinInitCon;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Kingt on 2017/6/5.
 */
@Component
public class WeiXinBasicInit {

    @Value("${appId}")
    private String appId;

    @Value("${appsecret}")
    private String appsecret;

    @Value("${baseUrl}")
    private String baseUrl;

    @Value("${weixin_token}")
    private String weixin_token;

    @PostConstruct
    public void setWeiXinInitCon() {
        WeiXinInitCon wxCon = WeiXinInitCon.getInstance();
        wxCon.setAppId(appId);
        wxCon.setAppSecurt(appsecret);
        wxCon.setBaseUrl(baseUrl);
        wxCon.setToken(weixin_token);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("初始化微信基本信息值成功！");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

    }
}
