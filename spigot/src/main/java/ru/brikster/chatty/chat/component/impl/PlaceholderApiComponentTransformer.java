package ru.brikster.chatty.chat.component.impl;

import me.clip.placeholderapi.PlaceholderAPI;
import org.jetbrains.annotations.NotNull;
import ru.brikster.chatty.chat.component.context.SinglePlayerTransformContext;

import javax.inject.Singleton;

@Singleton
public final class PlaceholderApiComponentTransformer extends PlaceholdersComponentTransformer {

    @Override
    public @NotNull String transform(@NotNull final String serializedString, @NotNull final SinglePlayerTransformContext transformContext) {
        return PlaceholderAPI.setPlaceholders(transformContext.getPlayer(), serializedString);
    }

}
