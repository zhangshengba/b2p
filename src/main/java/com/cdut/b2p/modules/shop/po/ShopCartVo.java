package com.cdut.b2p.modules.shop.po;
/**
 * @desc ShopCartVo是ShopCart类的扩展类
 * @author zsb
 *
 */
public class ShopCartVo extends  ShopCart{

	private static final long serialVersionUID = 1L;
	private String url;//图片路径
	private String describe;//商品描述
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
}
