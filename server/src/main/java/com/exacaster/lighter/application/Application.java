package com.exacaster.lighter.application;

import com.exacaster.lighter.spark.SubmitParams;
import com.exacaster.lighter.storage.Entity;
import java.time.LocalDateTime;
import java.util.StringJoiner;

public class Application implements Entity {

    private final String id;
    private final ApplicationType type;
    private final ApplicationState state;
    private final String appId;
    private final String appInfo;
    private final SubmitParams submitParams;
    private final LocalDateTime createdAt;

    public Application(String id, ApplicationType type, ApplicationState state, String appId, String appInfo, SubmitParams submitParams,
            LocalDateTime createdAt) {
        this.id = id;
        this.type = type;
        this.state = state;
        this.appId = appId;
        this.appInfo = appInfo;
        this.submitParams = submitParams;
        this.createdAt = createdAt;
    }

    @Override
    public String getId() {
        return id;
    }

    public ApplicationType getType() {
        return type;
    }

    public ApplicationState getState() {
        return state;
    }

    public String getAppId() {
        return appId;
    }

    public String getAppInfo() {
        return appInfo;
    }

    public SubmitParams getSubmitParams() {
        return submitParams;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Application.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("type=" + type)
                .add("state=" + state)
                .add("appId='" + appId + "'")
                .add("appInfo='" + appInfo + "'")
                .add("submitParams=" + submitParams)
                .add("createdAt=" + createdAt)
                .toString();
    }
}
