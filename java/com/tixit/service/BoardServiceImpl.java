package com.tixit.service;

import com.tixit.dao.BoardDAO;
import com.tixit.domain.BoardVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Inject
    private BoardDAO dao;

    @Override
    public void regist(BoardVO board) throws Exception {
        dao.create(board);
    }

    @Override
    public BoardVO read(Integer bno) throws Exception {
        return dao.read(bno);
    }

    @Override
    public void modify(BoardVO board) throws Exception {
        dao.update(board);
    }

    @Override
    public void modifyPage(BoardVO board) throws Exception {
        dao.update(board);
    }


    @Override
    public void remove(Integer bno) throws Exception {
        dao.delete(bno);
    }

    @Override
    public List<BoardVO> listAll() throws Exception {
        return dao.listAll();
    }


}
