package life.majiang.community.dto;

import lombok.Data;

/*
    评论对象
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
