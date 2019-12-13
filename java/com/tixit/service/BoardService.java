package com.tixit.service;

import com.tixit.domain.BoardVO;

import java.util.List;

public interface BoardService {

    public void regist(BoardVO board) throws Exception;

    public BoardVO read(Integer bno) throws Exception;

    public void modify(BoardVO board) throws Exception;

    public void modifyPage(BoardVO board) throws Exception;

    public void remove(Integer bno) throws Exception;

    public List<BoardVO> listAll() throws Exception;

}
