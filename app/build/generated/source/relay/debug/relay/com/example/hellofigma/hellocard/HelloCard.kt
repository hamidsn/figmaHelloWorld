package com.example.hellofigma.hellocard

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.hellofigma.R
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

// Design to select for HelloCard
enum class Design {
    ImageOnly,
    ImageTitleMessage,
    ImageTitle
}

/**
 * This composable was generated from the UI Package 'hello_card'.
 * Generated code; do not edit directly
 *
 * @param title hint
 * @param description hint
 */
@Composable
fun HelloCard(
    modifier: Modifier = Modifier,
    design: Design = Design.ImageOnly,
    title: String,
    description: String,
    onDoubleTap: () -> Unit = {}
) {
    when (design) {
        Design.ImageOnly -> TopLevelImageOnly(modifier = modifier) {
            Frame3ImageOnly {
                ImageImageOnly()
            }
        }
        Design.ImageTitleMessage -> TopLevelImageTitleMessage(modifier = modifier) {
            Frame1ImageTitleMessage {
                ImageImageTitleMessage()
                TitleImageTitleMessage(
                    title = title,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 130.0.dp
                        )
                    )
                )
                MessageImageTitleMessage(
                    onDoubleTap = onDoubleTap,
                    description = description,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 164.0.dp
                        )
                    )
                )
            }
        }
        Design.ImageTitle -> TopLevelImageTitle(modifier = modifier) {
            Frame1ImageTitle {
                ImageImageTitle()
                TitleImageTitle(
                    title = title,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 130.0.dp
                        )
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 242, heightDp = 156)
@Composable
private fun HelloCardImageOnlyPreview() {
    MaterialTheme {
        RelayContainer {
            HelloCard(
                title = "Hello World",
                description = "Description",
                onDoubleTap = {},
                design = Design.ImageOnly,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 242, heightDp = 218)
@Composable
private fun HelloCardImageTitleMessagePreview() {
    MaterialTheme {
        RelayContainer {
            HelloCard(
                title = "Hello World",
                description = "Description",
                onDoubleTap = {},
                design = Design.ImageTitleMessage,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 242, heightDp = 191)
@Composable
private fun HelloCardImageTitlePreview() {
    MaterialTheme {
        RelayContainer {
            HelloCard(
                title = "Hello World",
                description = "Description",
                onDoubleTap = {},
                design = Design.ImageTitle,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun ImageImageOnly(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.hello_card_image),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(216.0.dp).requiredHeight(124.0.dp)
    )
}

@Composable
fun Frame3ImageOnly(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TopLevelImageOnly(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 252,
            green = 246,
            blue = 239
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 16.0.dp),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ImageImageTitleMessage(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.hello_card_image),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(216.0.dp).requiredHeight(124.0.dp)
    )
}

@Composable
fun TitleImageTitleMessage(
    title: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = title,
        fontSize = 24.0.sp,
        color = Color(
            alpha = 255,
            red = 27,
            green = 28,
            blue = 32
        ),
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun MessageImageTitleMessage(
    onDoubleTap: () -> Unit,
    description: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = description,
        fontSize = 16.0.sp,
        color = Color(
            alpha = 255,
            red = 178,
            green = 80,
            blue = 139
        ),
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        modifier = modifier.tappable(onDoubleTap = onDoubleTap)
    )
}

@Composable
fun Frame1ImageTitleMessage(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(221.0.dp).requiredHeight(188.0.dp)
    )
}

@Composable
fun TopLevelImageTitleMessage(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 252,
            green = 246,
            blue = 239
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 16.0.dp),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ImageImageTitle(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.hello_card_image),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(216.0.dp).requiredHeight(124.0.dp)
    )
}

@Composable
fun TitleImageTitle(
    title: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = title,
        fontSize = 24.0.sp,
        color = Color(
            alpha = 255,
            red = 27,
            green = 28,
            blue = 32
        ),
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame1ImageTitle(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(221.0.dp).requiredHeight(159.0.dp)
    )
}

@Composable
fun TopLevelImageTitle(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 252,
            green = 246,
            blue = 239
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        padding = PaddingValues(all = 16.0.dp),
        itemSpacing = 10.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
