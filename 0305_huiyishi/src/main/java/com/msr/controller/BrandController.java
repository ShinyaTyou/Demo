package com.msr.controller;

import com.msr.bean.Brand;
import com.msr.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping("/selectAll")
    public String selectAll(Model model){

        List<Brand> brandList = brandService.selectAll();
        model.addAttribute("brandList",brandList);
        return "index";
    }

    @RequestMapping("/add")
    public String toAdd(Model model){

        List<String> nameList = brandService.selectName();
        model.addAttribute("nameList",nameList);
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Model model, Brand brand){

        Integer row = brandService.add(brand);
        if(row != 0){
            model.addAttribute("mes","预定成功");
        }
        else {
            model.addAttribute("mes","预定失败");
        }

        List<Brand> brandList = brandService.selectAll();
        model.addAttribute("brandList",brandList);
        return "index";
        //return "redirect:/selectAll";
    }
}
