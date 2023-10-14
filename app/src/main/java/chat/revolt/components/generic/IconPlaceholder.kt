package chat.revolt.components.generic

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val NoopHandler = {}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun IconPlaceholder(
    name: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = NoopHandler,
    onLongClick: () -> Unit = NoopHandler,
    fontSize: TextUnit = 20.sp
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .background(MaterialTheme.colorScheme.surfaceColorAtElevation(3.dp))
            .then(
                if (onClick != NoopHandler || onLongClick != NoopHandler) Modifier.combinedClickable(
                    onClick = onClick,
                    onLongClick = onLongClick
                )
                else Modifier
            )
    ) {
        Text(
            text = name.first().uppercase(),
            fontSize = fontSize,
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}