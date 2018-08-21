package com.cdut.b2p.modules.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cdut.b2p.common.controller.BaseController;
import com.cdut.b2p.modules.shop.po.ShopComment;
import com.cdut.b2p.modules.shop.service.ShopCommentService;

@Controller
@RequestMapping("${shopPath}/comment")
public class ShopCommentController extends BaseController{
	@Autowired
	private ShopCommentService shopCommentService;
	@RequestMapping(value="/getAll")
	public String getAllByGoodsId(HttpServletResponse response,HttpServletRequest request) {
		ModelAndView model=new ModelAndView();
		//获取商品id
		String gid=request.getParameter("gid");
		List<ShopComment> list=shopCommentService.findCommentByGoods(gid);
		model.addObject("CommentList", list);
		return renderString(response, model);
	}
}
