package com.ikeapp.entity.view;

import com.ikeapp.entity.domain.PointDomain;
import com.ikeapp.entity.domain.ProjectDomain;

/**
 * created by wei.shen
 * 2018/5/2
 */
public class MapProjectVo {

    private ProjectDomain project;

    private PointDomain point;

    public ProjectDomain getProject() {
        return project;
    }

    public void setProject(ProjectDomain project) {
        this.project = project;
    }

    public PointDomain getPoint() {
        return point;
    }

    public void setPoint(PointDomain point) {
        this.point = point;
    }
}
