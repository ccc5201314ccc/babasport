package com.lionxxw.babasport.controller.back;

import com.lionxxw.babasport.core.dto.BrandDto;
import com.lionxxw.babasport.core.service.BrandService;
import com.lionxxw.babasport.core.service.ProductService;
import com.lionxxw.common.model.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * 后台商品管理
 * 商品列表
 * 商品添加'
 * 商品上架
 * @author lx
 *
 */
@Controller
@RequestMapping(value = "brand")
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	@Autowired
	private ProductService productService;

	//商品列表
	@RequestMapping(value = "/list.do")
	public ModelAndView list(BrandDto params, PageQuery query){
		ModelAndView mv = new ModelAndView();


		mv.setViewName("brand/list");
		return mv;
	}

	@RequestMapping(value = "/add.do")
	public ModelAndView add(BrandDto params, PageQuery query){
		ModelAndView mv = new ModelAndView();


		mv.setViewName("brand/add");
		return mv;
	}
}
