package com.tixit.cs;

import com.tixit.domain.BoardVO;
import com.tixit.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;


@Controller
@RequestMapping("/board/*")
public class BoardController {

  /* private static final Logger logger = LoggerFactory.getLogger(BoardController.class);*/

    @Inject
    private BoardService service;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void registerGET(BoardVO board, Model model) throws Exception {



    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception {

     /*   logger.info("regist post ...........");
        logger.info(board.toString());*/

        service.regist(board);

        rttr.addFlashAttribute("msg", "success");
        return "redirect:/board/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void listAll(Model model) throws Exception {

      /*  logger.info("show all list......................");*/
       model.addAttribute("list", service.listAll());
    }




}
