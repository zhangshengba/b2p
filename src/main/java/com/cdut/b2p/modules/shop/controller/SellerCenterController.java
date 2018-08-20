package com.cdut.b2p.modules.shop.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.cdut.b2p.common.config.Global;
import com.cdut.b2p.common.controller.BaseController;
import com.cdut.b2p.modules.shop.security.annotation.ShopAuth;

/**
 * @title SellerCenterController
 * @desc SellerCenterController为卖家中心处理类
 * @author zsb
 * @Date 2018/8/18
 *
 */
@Controller
@RequestMapping("${shopPath}/sellerCenter/")
public class SellerCenterController extends BaseController {

	@ResponseBody
	@RequestMapping(value = ("upload"), method = RequestMethod.POST)
	public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) throws IllegalStateException, IOException {

		String path = request.getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
		// 获取文件上传的真实路径
		String uploadPath = request.getSession().getServletContext().getRealPath("/");
		// 上传文件过程

		String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);

		String destDir = Global.getGoodsfilesBaseDir();
		File destFile = new File(uploadPath + destDir);
		if (!destFile.exists()) {
			destFile.mkdirs();
		}
		String fileNameNew = String.valueOf(System.currentTimeMillis()) + "." + suffix;
		File f = new File(destFile.getAbsoluteFile() + File.separator + fileNameNew);
		// 如果当前文件已经存在了，就跳过。
		if (f.exists()) {
			return "";
		}
		file.transferTo(f);
		f.createNewFile();

		return (destDir + File.separator + fileNameNew);
	}

}
