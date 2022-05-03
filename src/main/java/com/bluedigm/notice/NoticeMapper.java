package com.bluedigm.notice;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {

    List<NoticeDto> getNoticeList();
    NoticeDto getNotice();
    Integer createNotice(NoticeDto noticeDao);
    Integer updateNotice(NoticeDto noticeDao);
}
