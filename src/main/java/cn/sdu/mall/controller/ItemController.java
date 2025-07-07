package cn.sdu.mall.controller;

import cn.sdu.mall.pojo.Item;
import cn.sdu.mall.server.ItemService;
import cn.sdu.mall.util.ServerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/selectByCategoryId")
    @ResponseBody
    public ServerResult<List<Item>> selectByCategoryId(Integer categoryId) {
        List<Item> item = itemService.selectByCategoryId(categoryId);
        return ServerResult.ok(item);
    }

    @PostMapping(value = "/item/insert", consumes = "multipart/form-data")
    @ResponseBody
    public ServerResult<Void> insert(Item item, MultipartFile file) {

        File f = new File("E:\\desktop\\Code\\java.code\\mall\\image\\", file.getOriginalFilename());
        try {
            file.transferTo(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        item.setImage(f.getName());
        try{
            itemService.insert(item);
        }catch(RuntimeException e){
            return ServerResult.error(500, e.getMessage());
        }

        return ServerResult.ok();
    }

    @DeleteMapping("/item/deleteById")
    @ResponseBody
    public ServerResult<Void> deleteById(Integer id) {
        try {
            itemService.delete(id);
        } catch (Exception e) {
            return ServerResult.error(500, e.getMessage());
        }
        return ServerResult.ok();
    }

    @GetMapping("/item/selectById")
    @ResponseBody
    public ServerResult<Item> selectById(Integer id) {
        Item item = itemService.selectById(id);
        return ServerResult.ok(item);
    }

    @PostMapping(value = "/item/update", consumes = "multipart/form-data")
    public String update(Item item, MultipartFile file) {

        if(file != null){

            File f = new File("E:\\desktop\\Code\\java.code\\mall\\image\\", file.getOriginalFilename());
            try {
                file.transferTo(f);
                item.setImage(f.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        try{
            itemService.update(item);
        }catch(RuntimeException e){
            return null;
        }

        return "redirect:/itemList.html?categoryId="+item.getCategoryId();
    }


}
