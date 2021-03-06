package com.github.wechatpay.apiv3;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 11:33
 */

class HttpResponse extends HttpMessage {

    private int status;

    public HttpResponse() {
        super("", "");
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
