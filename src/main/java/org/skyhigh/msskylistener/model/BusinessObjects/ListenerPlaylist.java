package org.skyhigh.msskylistener.model.BusinessObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class ListenerPlaylist {
    private UUID userId;
    private UUID playlistId;
    private String playlistName;
    private byte[] playlistPhoto;
    private boolean isLike;
}
