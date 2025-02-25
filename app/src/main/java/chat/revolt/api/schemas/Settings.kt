package chat.revolt.api.schemas

import chat.revolt.ui.theme.OverridableColourScheme
import kotlinx.serialization.Serializable

@Serializable
data class OrderingSettings(
    val servers: List<String> = emptyList()
)

@Serializable
data class AndroidSpecificSettingsSpecialEmbedSettings(
    /**
     * Whether to embed YouTube videos interactively.
     * Boolean.
     */
    val embedYouTube: Boolean = true,
    /**
     * Whether to embed Apple Music albums and tracks interactively.
     * Boolean.
     */
    val embedAppleMusic: Boolean = false
)

@Serializable
data class AndroidSpecificSettings(
    /**
     * The theme to use for the app.
     * Can be one of `{ None, Revolt, Light, M3Dynamic, Amoled }`
     */
    var theme: String? = null,
    /**
     * Colour overrides.
     * Map of `primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim` to int colours.
     */
    var colourOverrides: OverridableColourScheme? = null,
    /**
     * Message reply style.
     * Can be one of `{ None, SwipeFromEnd, DoubleTap }`
     */
    var messageReplyStyle: String? = null,
    /**
     * Avatar radius.
     * Must be integer in range 0..50 inclusive.
     */
    var avatarRadius: Int? = null,
    /**
     * Controls preferences for special embeds.
     * Object; See [AndroidSpecificSettingsSpecialEmbedSettings] for format.
     */
    var specialEmbedSettings: AndroidSpecificSettingsSpecialEmbedSettings? = null
)
