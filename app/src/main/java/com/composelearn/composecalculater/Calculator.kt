package com.composelearn.composecalculater

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composelearn.composecalculater.ui.theme.ComposeCalculatorTheme
import com.composelearn.composecalculater.ui.theme.LightGrey
import com.composelearn.composecalculater.ui.theme.Orange

@Composable
fun Calculator(
    state: CalculatorState = CalculatorState(),
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorAction) -> Unit = {}
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.operand1 + (state.operation?.symbol ?: "") + state.operand2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight =  FontWeight.Light,
                fontSize = 84.sp,
                color = Color.White,
                lineHeight = 90.sp,
                maxLines = 2
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(LightGrey)
                        .aspectRatio(2f) //the width is twice as the height
                        .weight(2f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Clear)
                }
                CalculatorButton(
                    symbol = "Del",
                    modifier = Modifier
                        .background(LightGrey)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Delete)
                }
                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Number(7))
                }
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Number(8))
                }
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Number(9))
                }
                CalculatorButton(
                    symbol = "*",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Number(4))
                }
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Number(5))
                }
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Number(6))
                }
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Number(1))
                }
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Number(2))
                }
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Number(3))
                }
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f) //the width is twice as the height
                        .weight(2f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Number(0))
                }
                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Decimal)
                }
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f) //the width is twice as the height
                        .weight(1f) // the width is twice as the other components in the same row
                ) {
                    onAction(CalculatorAction.Calculate)
                }
            }
        }
    }
}

